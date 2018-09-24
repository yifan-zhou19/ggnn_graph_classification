package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String a = new String(new char[5000]);
	  int[] c = new int[400];
	  int i;
	  int n;
	  int k;
	  int t;

	  a = new Scanner(System.in).nextLine();
	  n = a.length();

	  for (i = 0,t = 0;i < n;i++)
	  {
		if (a.charAt(i) == ' ')
		{
			if (k == 0)
			{
				t++;
			}
			k++;
		}
		else
		{
			if (c[t] == 0)
			{
				k = 0;
			}
			c[t]++;
		}
	  }

	  for (i = 0;i < t;i++)
	  {
		  System.out.printf("%d,",c[i]);
	  }
	  System.out.printf("%d",c[i]);


	}
}
