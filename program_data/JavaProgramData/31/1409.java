public class node
{
public char[][] data = new char[10][20];
public node pre;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	node p1;
	node p2;
	p1 = new node();
	for (i = 1;i <= 6;i++)
	{
	p1.data[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
	}
	p1.pre = null;
	while (p1.data[1][0] != 'e')
	{
	p2 = new node();
	p2.pre = p1;
	for (i = 1;i <= 6;i++)
	{
	p2.data[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
	}
	p1 = p2;
	}
	p1 = p1.pre;
	while (p1.pre != null)
	{
	for (i = 1;i <= 5;i++)
	{
	System.out.print(p1.data[i]);
	System.out.print(' ');
	}
	System.out.print(p1.data[6]);
	System.out.print("\n");
	p1 = p1.pre;
	}
	for (i = 1;i <= 5;i++)
	{
	System.out.print(p1.data[i]);
	System.out.print(' ');
	}
	System.out.print(p1.data[6]);
	}



}

