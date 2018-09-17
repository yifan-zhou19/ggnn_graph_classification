package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] count = new int[128];
		int i;
		int c;
		int b = 0;
		c = System.in.read();
		while (c != '\n')
		{
			count[c]++;
			c = System.in.read();
		}
		for (i = 'A';i <= 'Z';i++)
		{
		if (count[i] != 0)
		{
			System.out.printf("%c=%d\n",i,count[i]);
			b = 1;
		}
		}
		for (i = 'a';i <= 'z';i++)
		{
		if (count[i] != 0)
		{
			System.out.printf("%c=%d\n",i,count[i]);
			b = 1;
		}
		}
		if (b == 0)
		{
			System.out.print("No");
		}
	}
}
