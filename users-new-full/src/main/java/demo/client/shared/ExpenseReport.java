package demo.client.shared;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class ExpenseReport implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(generator = "EXPENSEREPORT_ID_GENERATOR", strategy = javax.persistence.GenerationType.AUTO)
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "EXPENSEREPORT_ID_SEQ", name = "EXPENSEREPORT_ID_GENERATOR")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label(value = "Date")
	private java.util.Date date;

	@javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.EAGER, cascade = {javax.persistence.CascadeType.ALL})
	@org.kie.api.definition.type.Label(value = "Associate")
	private demo.client.shared.Associate associate;

	@javax.persistence.OneToMany(fetch = javax.persistence.FetchType.EAGER, cascade = {javax.persistence.CascadeType.ALL})
	@org.kie.api.definition.type.Label(value = "Expenses")
	private java.util.List<demo.client.shared.Expense> expenses;

	@org.kie.api.definition.type.Label(value = "Total")
	private java.lang.Double total;

	public ExpenseReport() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.util.Date getDate() {
		return this.date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public demo.client.shared.Associate getAssociate() {
		return this.associate;
	}

	public void setAssociate(demo.client.shared.Associate associate) {
		this.associate = associate;
	}

	public java.util.List<demo.client.shared.Expense> getExpenses() {
		return this.expenses;
	}

	public void setExpenses(java.util.List<demo.client.shared.Expense> expenses) {
		this.expenses = expenses;
	}

	public java.lang.Double getTotal() {
		return this.total;
	}

	public void setTotal(java.lang.Double total) {
		this.total = total;
	}

	public ExpenseReport(java.lang.Long id, java.util.Date date,
			demo.client.shared.Associate associate,
			java.util.List<demo.client.shared.Expense> expenses,
			java.lang.Double total) {
		this.id = id;
		this.date = date;
		this.associate = associate;
		this.expenses = expenses;
		this.total = total;
	}

}