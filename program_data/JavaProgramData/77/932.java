package <missing>;

public class GlobalMembers
{
	public static void pei(String a)
	{
		int t = a.length();
		int i;
		for (i = 0;i < t - 1;i++)
		{
			if (a[i].equals('}'))
			{
				int s = i - 1;
				while (a[s].equals('0'))
				{
					s--;
				}
				while (!a[s].equals('{'))
				{
					s--;
				}
				a[s] = '0';
				a[i] = '0';
				System.out.printf("%d %d",s,i);
				System.out.print("\n");
			}
			else
			{
				if (a[i].equals(')'))
				{
				int s = i - 1;
				while (a[s].equals('0'))
				{
					s--;
				}
				while (!a[s].equals('('))
				{
					s--;
				}
				a[s] = '0';
				a[i] = '0';
				System.out.printf("%d %d",s,i);
				System.out.print("\n");
				}
				else
				{
					if (a[i].equals(']'))
					{
				int s = i - 1;
				while (a[s].equals('0'))
				{
					s--;
				}
				while (!a[s].equals('['))
				{
					s--;
				}
				a[s] = '0';
				a[i] = '0';
				System.out.printf("%d %d",s,i);
				System.out.print("\n");
					}
					else
					{
							if (a[i].equals('>'))
							{
				int s = i - 1;
				while (a[s].equals('0'))
				{
					s--;
				}
				while (!a[s].equals('<'))
				{
					s--;
				}
				a[s] = '0';
				a[i] = '0';
				System.out.printf("%d %d",s,i);
				System.out.print("\n");
							}
					}
				}
			}



		}
		i = 0;
	System.out.printf("%d %d",i,t - 1);
	}
	public static void Main()
	{
		String a = new String(new char[250]);
		a = new Scanner(System.in).nextLine();
		pei(a);
	}
}
