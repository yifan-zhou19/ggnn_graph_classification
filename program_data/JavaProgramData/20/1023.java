package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String a = new String(new char[11]);
		 String b = new String(new char[4]);
		char max;
		int i;
		int j;
		int imax;
		while (scanf("%s %s",a,b) != EOF)
		{


			max = a.charAt(0);
			imax = 0;
			for (i = 1;;i++)
			{
				if (a.charAt(i) == 0)
				{
					break;
				}
				if (a.charAt(i) > max)
				{
					max = a.charAt(i);
					imax = i;
				}
			}
			for (j = 0;j <= imax;j++)
			{
				System.out.printf("%c",a.charAt(j));
			}
			System.out.printf("%c%c%c",b.charAt(0),b.charAt(1),b.charAt(2)); //???puts??\n
			for (j = imax + 1;;j++)
			{
				if (a.charAt(j) == 0)
				{
					System.out.print("\n");
					break;
				}
				System.out.printf("%c",a.charAt(j));
			}
		}
		return 0;
	}

}
