package transaction;

public class transcation
{
	String date;
	String description;
	String debit;
	String credit;
}

public transaction(String date, String description, String debit, String credit)
{
	setDate(date);
	setDescription(description);
	setDebit(debit);
	setCredit(credit);
}

public void setDate(String date)
{
	this.date = date;
}

public void setDescription(String description)
{
	this.dsescription = dsescription;
}

public void setDebit(String debit)
{
	this.debit = debit;
}

public void setCredit(String credit)
{
	this.credit = credit;
}

@Override
public boolean equals(Object transaction)
{
	if(transaction == null)
		return false;
	
	if (!(transaction instanceof Transaction)) return false;
	
	Transaction t = (Transaction)transaction;
	
	if(!getDate().equals(t.getDate()))
	{
		System.out.println(String.format("Date %s does not euqal %s", getDate(), t.getDate()));
		return false;
	}
	
	if(!getDescription().equals(t.getDescritpion()))
	{
		System.out.println(String.format("Date %s does not euqal %s", getDescritpion(), t.getDescritpion()));
		return false;
	}
	
	if(!getDebit().equals(t.getDebit()))
	{
		System.out.println(String.format("Date %s does not euqal %s", getDebit(), t.getDebit()));
		return false;
	}
	
	if(!getCredit().equals(t.getCredit()))
	{
		System.out.println(String.format("Date %s does not euqal %s", getCredit(), t.getCredit()));
		return false;
	}
	
	return true;
}