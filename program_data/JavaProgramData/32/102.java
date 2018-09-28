package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void min(char a[],char b[]);
	int n;
	int i;
	int j;
	int k;

	char[][] a = new char[100][110];
	char[][] b = new char[100][110];

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[i] = tempVar3.charAt(0);
		}
	   System.out.print("\n");
	}
	for (i = 0;i < n;i++)
	{
	  min(a[i], b[i]);
	}
	}

	public static void min(String a, String b)
	{
	 int i;
	 int j = 0;
	 int[] pa = new int[110];
	 int[] pb = new int[110];
		  int la = a.length();
		  int lb = b.length();
		  for (i = la - 1;i >= 0;i--)
		  {
			pa[j++] = a[i] - '0';
		  }
		  for (i = j;i < 109;i++)
		  {
			  pa[i] = 0;
		  }
		  j = 0;

		  for (i = lb - 1;i >= 0;i--)
		  {
			 pb[j++] = b[i] - '0';
		  }
		  for (i = j;i < 109;i++)
		  {
			  pb[i] = 0;
		  }
		  for (i = 0;i < la;i++)
		  {
			  pa[i] -= pb[i];
			  if (pa[i] < 0)
			  {
				  pa[i] += 10;
				  pa[i + 1]--;
			  }
		  }
		  int out = 0;
		  for (i = la - 1;i >= 0;i--)
		  {
		  if (out != 0)
		  {
			  System.out.printf("%d",pa[i]);
		  }
			  else if (pa[i])
			  {
				  System.out.printf("%d",pa[i]);
				  out = 1;
			  }

		  }
		  System.out.print("\n");
		  return;
	}
}

