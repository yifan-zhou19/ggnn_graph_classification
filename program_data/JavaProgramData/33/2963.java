package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		String d = new String(new char[300]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j <= 256;j++)
			{
				d = d.substring(0, j);
			}
			d = new Scanner(System.in).nextLine();
			j = 0;
			while (d.charAt(j) != 0)
			{
				switch (d.charAt(j))
				{
				case 'A':
						System.out.print("T");
						break;
				case 'T':
						System.out.print("A");
						break;
				case 'C':
						System.out.print("G");
						break;
				case 'G':
						System.out.print("C");
						break;
				}
				j++;
			}
			System.out.print("\n");
		}
	}

}

