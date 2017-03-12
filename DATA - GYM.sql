DROP SCHEMA

IF EXISTS gym;
	CREATE SCHEMA gym COLLATE = utf8_general_ci;

USE gym;

CREATE TABLE  skills  (
   skill_id  INT (11) UNSIGNED NOT NULL,
   name_skill  VARCHAR(25),
  PRIMARY KEY ( skill_id )
);

CREATE TABLE  users  (
   user_id  INT (11) UNSIGNED NOT NULL,
   surnames  VARCHAR(25),
   names  VARCHAR(15),
   sex  VARCHAR(15),
   phone  INT (15),
   rol  VARCHAR(15),
   skill_id  INT (11) UNSIGNED NOT NULL,
  PRIMARY KEY ( user_id ),
  CONSTRAINT users_skills_skill_id FOREIGN KEY (skill_id) REFERENCES skills(skill_id)
);

CREATE TABLE  living_rooms  (
   room_id  INT (11) UNSIGNED NOT NULL,
   number_room  INT (10),
  PRIMARY KEY ( room_id )
  );

CREATE TABLE  sessions  (
   session_id  INT (11) UNSIGNED NOT NULL,
   user_id  INT (11) UNSIGNED NOT NULL,
   room_id  INT (11) UNSIGNED NOT NULL,
   schedule  datetime,
  PRIMARY KEY ( session_id ),
  CONSTRAINT sessions_users_user_id FOREIGN KEY (user_id) REFERENCES users(user_id),
  CONSTRAINT sessions_living_rooms_room_id FOREIGN KEY (room_id) REFERENCES living_rooms(room_id)
);

CREATE TABLE  profile_clients  (
   client_id  INT (11) UNSIGNED NOT NULL,
   date_entry  datetime,
   age  INT (2),
   weight  DECIMAL,
   size  DECIMAL,
   dough_bodily  DECIMAL,
   user_id  INT (11) UNSIGNED NOT NULL,
  PRIMARY KEY ( client_id ),
  CONSTRAINT profile_clients_users_user_id FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE  institutions  (
   inst_id  INT (11) UNSIGNED NOT NULL,
   ruc  INT (11) UNSIGNED NOT NULL,
   reason_social  VARCHAR(40),
   address  VARCHAR(40),
   user_id  INT (11) UNSIGNED NOT NULL,
   phone  INT (9),
  PRIMARY KEY ( inst_id ),
  CONSTRAINT institutions_users_user_id FOREIGN KEY (user_id) REFERENCES users(user_id)
);

CREATE TABLE  plans  (
   plan_id  INT (5) UNSIGNED NOT NULL,
   type_plan  VARCHAR(20),
   price  DECIMAL,
   inst_id  INT (11) UNSIGNED NOT NULL,
  PRIMARY KEY ( plan_id ),
  CONSTRAINT plans_institutions_inst_id FOREIGN KEY (inst_id) REFERENCES institutions(inst_id)
);

CREATE TABLE  subscriptions  (
   sus_id  INT (5) UNSIGNED NOT NULL,
   client_id  INT (11) UNSIGNED NOT NULL,
   plan_id  INT (5) UNSIGNED NOT NULL,
  PRIMARY KEY ( sus_id ),
  CONSTRAINT subscriptions_profile_clients_client_id FOREIGN KEY (client_id) REFERENCES profile_clients(client_id),
  CONSTRAINT subscriptions_plans_plan_id FOREIGN KEY (plan_id) REFERENCES plans(plan_id)
);




