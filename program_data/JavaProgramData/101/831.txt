public class ABC
{
	public int amount; // to store the amount they eat
	public int statements; // to store the number of the true statements
	public char name; // to store the name A, B, C
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		ABC p1 = new ABC();
		ABC p2 = new ABC();
		ABC p3 = new ABC();
		p1.name = 'A';
		p2.name = 'B';
		p3.name = 'C';
		for (p1.amount = 0; p1.amount < 3; p1.amount++)
		{
			for (p2.amount = 0; p2.amount < 3; p2.amount++)
			{
				for (p3.amount = 0; p3.amount < 3; p3.amount++)
				{ // use 0,1,2 to mean the amount they eat
					p1.statements = (p2.amount > p1.amount) + (p3.amount == p1.amount); // to calculate the true statements
					p2.statements = (p1.amount > p2.amount) + (p1.amount > p3.amount);
					p3.statements = (p3.amount > p2.amount) + (p2.amount > p1.amount);
					int a; // to check whether they are in the right order
					int b;
					int c;
					a = (p1.amount > p2.amount && p1.statements < p2.statements) || (p1.amount < p2.amount && p1.statements > p2.statements);
					b = (p1.amount > p3.amount && p1.statements < p3.statements) || (p1.amount < p3.amount && p1.statements > p3.statements);
					c = (p3.amount > p2.amount && p3.statements < p2.statements) || (p3.amount < p2.amount && p3.statements > p2.statements);
					if (a + b + c == 3)
					{
						int temp1; // the middle values used for switch the values
						char temp2;
						if (p1.amount > p2.amount)
						{ // give A,B,C a right order
							temp1 = p1.amount;
							p1.amount = p2.amount;
							p2.amount = temp1;
							temp2 = p1.name;
							p1.name = p2.name;
							p2.name = temp2;
						}
						if (p1.amount > p3.amount)
						{
							temp1 = p1.amount;
							p1.amount = p3.amount;
							p3.amount = temp1;
							temp2 = p1.name;
							p1.name = p3.name;
							p3.name = temp2;
						}
						if (p2.amount > p3.amount)
						{
							temp1 = p3.amount;
							p3.amount = p2.amount;
							p2.amount = temp1;
							temp2 = p3.name;
							p3.name = p2.name;
							p2.name = temp2;
						}
						System.out.print(p1.name);
						System.out.print(p2.name);
						System.out.print(p3.name);
						System.out.print("\n");

						return 0;
					}
				}

			}
		}
		return 0;
	}
}
