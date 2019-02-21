package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 

	
	private int amount;
	
	public Money(int amount) {
		super();
		this.amount = amount;
	}

	public Money add(Money money) {
		Money m_add = new Money(this.amount+money.amount);
		return m_add;
	}

	public Money minus(Money money) {
		Money m_minus = new Money(this.amount - money.amount);
		return m_minus;
	}

	public Money multiply(Money money) {
		Money m_multiply = new Money(this.amount * money.amount);
		return m_multiply;
	}

	public Money devide(Money money) {
		Money m_devide = new Money(this.amount / money.amount);
		return m_devide;
	}
	
	public boolean equals(Money money) {
		boolean flag = false;
		if(this.amount == money.amount) flag = true;
		return flag;
	}
}