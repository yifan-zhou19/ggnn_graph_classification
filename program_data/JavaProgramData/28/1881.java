package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int num = 0;
	int x = 0;
	int[] dcs = new int[360];
	String dc = new String(new char[6000]);
	dc = new Scanner(System.in).nextLine();
	for (int i = 0;i < dc.length();i++)
	{
		  if (dc.charAt(i) == ' ')
		  {
			   dcs[x] = num;
			   x++;
			   num = 0;
		  }
		  else
		  {
			  num++;
		  }
		  if (i == dc.length() - 1)
		  {
				dcs[x] = num;
				x++;
		  }
	}
	for (int j = 0;j < x;j++)
	{
		  if (dcs[j] != 0)
		  {
			  if (j != x - 1)
			  {
					 System.out.printf("%d,",dcs[j]);
			  }
			  else
			  {
					 System.out.printf("%d",dcs[j]);
					 break;
			  }
		  }
	}
	return 0;
	}
}
