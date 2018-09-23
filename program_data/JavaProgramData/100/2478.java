package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[26];
		int i = 0;
		int[] b = new int[26];
		int[] d = new int[26];
		int[] x = new int[26];
		int n = 0;
		int j = 0;
		int t = 0;
	final String c = "";
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  c = tempVar.charAt(0);
	  }
	  n = c.length();
	  for (i = 0;i < 26;i++)
	  {
		  a[i] = 65 + i;
		b[i] = 97 + i;
	  }
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 26;j++)
			{
				 if (c.charAt(i) - a[j] == 0)
				 {
					 d[j]++;
				 }
			   else if (c.charAt(i) - b[j] == 0)
			   {
				   x[j]++;
			   }

			}
		}
		for (i = 0;i < 26;i++)
		{
			if (d[i] != 0 || x[i] != 0)
			{
				 t = 1;
			  break;
			}
		}
		if (t == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < 26;i++)
			{
				if (d[i] != 0)
				{
					System.out.printf("%c=%d\n",a[i],d[i]);
				}
			}
			for (i = 0;i < 26;i++)
			{
				if (x[i] != 0)
				{
					System.out.printf("%c=%d\n",b[i],x[i]);
				}
			}
		}

		return (0);
	}
}

