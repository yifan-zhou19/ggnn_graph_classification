package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[50]);
		int a;
		int b;
		int c;
		int i;
		int j;
		int k;
		j = 0;
			while (scanf("%s", zfc) != EOF)
			{
			if (j != 0)
			{
				System.out.print(",");
			}
			System.out.printf("%d",zfc.length());
			j++;
			}




		return 0;
	}





}
