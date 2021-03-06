package demo.client.shared;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Associate implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(generator = "ASSOCIATE_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "ASSOCIATE_ID_SEQ", name = "ASSOCIATE_ID_GENERATOR")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label("Name")
	@javax.validation.constraints.NotNull
	@org.hibernate.validator.constraints.NotEmpty
	private java.lang.String name;

	@org.kie.api.definition.type.Label("Last Name")
	@javax.validation.constraints.NotNull
	@org.hibernate.validator.constraints.NotEmpty
	private java.lang.String lastName;

	@org.kie.api.definition.type.Label("Address")
	private java.lang.String address;

	public Associate() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getLastName() {
		return this.lastName;
	}

	public void setLastName(java.lang.String lastName) {
		this.lastName = lastName;
	}

	public java.lang.String getAddress() {
		return this.address;
	}

	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	public Associate(java.lang.Long id, java.lang.String name,
			java.lang.String lastName, java.lang.String address) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.address = address;
	}

}