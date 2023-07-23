package forms.InternalAssignment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class User {

	    @Id

	    @GeneratedValue
	    private Long asso_id;

	    private String asso_name;

	    private String proj_id;

	    private String proj_name;

	    private String cust_name;

	    private String skill;

	    private String asso_city;

	    private String hcm_name;

	    private String mentor_name;

	    private String current_status;

		public Long getAsso_id() {
			return asso_id;
		}

		public void setAsso_id(Long asso_id) {
			this.asso_id = asso_id;
		}

		public String getAsso_name() {
			return asso_name;
		}

		public void setAsso_name(String asso_name) {
			this.asso_name = asso_name;
		}

		public String getProj_id() {
			return proj_id;
		}

		public void setProj_id(String proj_id) {
			this.proj_id = proj_id;
		}

		public String getProj_name() {
			return proj_name;
		}

		public void setProj_name(String proj_name) {
			this.proj_name = proj_name;
		}

		public String getCust_name() {
			return cust_name;
		}

		public void setCust_name(String cust_name) {
			this.cust_name = cust_name;
		}

		public String getSkill() {
			return skill;
		}

		public void setSkill(String skill) {
			this.skill = skill;
		}

		public String getAsso_city() {
			return asso_city;
		}

		public void setAsso_city(String asso_city) {
			this.asso_city = asso_city;
		}

		public String getHcm_name() {
			return hcm_name;
		}

		public void setHcm_name(String hcm_name) {
			this.hcm_name = hcm_name;
		}

		public String getMentor_name() {
			return mentor_name;
		}

		public void setMentor_name(String mentor_name) {
			this.mentor_name = mentor_name;
		}

		public String getCurrent_status() {
			return current_status;
		}

		public void setCurrent_status(String current_status) {
			this.current_status = current_status;
		}

		public User(Long asso_id, String asso_name, String proj_id, String proj_name, String cust_name, String skill,
				String asso_city, String hcm_name, String mentor_name, String current_status) {
			super();
			this.asso_id = asso_id;
			this.asso_name = asso_name;
			this.proj_id = proj_id;
			this.proj_name = proj_name;
			this.cust_name = cust_name;
			this.skill = skill;
			this.asso_city = asso_city;
			this.hcm_name = hcm_name;
			this.mentor_name = mentor_name;
			this.current_status = current_status;
		}

		public User() {
			super();
		}
	    
}
	