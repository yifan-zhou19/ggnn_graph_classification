package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[4];
	public static int[] name = new int[4];
	public static int work()
	{
	  int i;
	  int j;
	  int t;
	  for (i = 2; i >= 0; i--)
	  {
		for (j = 0; j <= i; j++)
		{
		  if (a[j] < a[j + 1])
		  {
			t = a[j];
			a[j] = a[j + 1];
			a[j + 1] = t;
			t = name[j];
			name[j] = name[j + 1];
			name[j + 1] = t;
		  }
		}
	  }
	  for (i = 0; i <= 3; i++)
	  {
		switch (name[i])
		{
		  case 0 :
			  System.out.print("z");
			  break;
		  case 1 :
			  System.out.print("q");
			  break;
		  case 2 :
			  System.out.print("s");
			  break;
		  case 3 :
			  System.out.print("l");
			  break;
		}
		System.out.printf(" %d\n", a[i] * 10);
	  }
	  return 0;
	}
	public static int Main()
	{
	  int i;
	  for (i = 0; i <= 3; i++)
	  {
		name[i] = i;
	  }
	  for (a[0] = 1; a[0] <= 5; a[0]++)
	  {
		for (a[1] = 1; a[1] <= 5; a[1]++)
		{
		  if (a[1] != a[0])
		  {
		  for (a[2] = 1; a[2] <= 5; a[2]++)
		  {
			if (a[2] != a[1] && a[2] != a[1])
			{
			for (a[3] = 1; a[3] <= 5; a[3]++)
			{
			  if ((a[0] + a[1] == a[2] + a[3]) && (a[0] + a[3] > a[1] + a[2]) && (a[0] + a[2] < a[1]))
			  {
			  work();
			  }
			}
			}
		  }
		  }
		}
	  }
	  return 0;
	}

}
