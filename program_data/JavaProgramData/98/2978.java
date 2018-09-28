package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int n;
	  int t;
	  char[][] a = new char[1000][40];
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
	  }
	  t = 0;
	  for (i = 0;i < n - 1;i++)
	  {
		if (String.valueOf(a[i]).length() + t > 80)
		{
		  System.out.printf("\n%s",a[i]);
		  t = String.valueOf(a[i]).length() + 1;
		}
		else if (String.valueOf(a[i]).length() + t <= 80)
		{
		  if (t + String.valueOf(a[i]).length() + 1 + String.valueOf(a[i + 1]).length() <= 80)
		  {
			System.out.printf("%s ",a[i]);
			t = t + String.valueOf(a[i]).length() + 1;
		  }
		  else
		  {
			System.out.printf("%s\n",a[i]);
			t = 0;
		  }
		}
	  }
	  System.out.printf("%s",a[n - 1]);
	  return 0;
	}
}

