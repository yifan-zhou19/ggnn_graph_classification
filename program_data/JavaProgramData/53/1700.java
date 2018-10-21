package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[] a = new int[100];
	  int n;
	  int i;
	  int j;
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
			a[i] = Integer.parseInt(tempVar2);
		}
	  }
	  for (i = 0;i < n - 1;i++)
	  {
		for (j = i + 1;j < n;j++)
		{
		  if (a[i] == a[j])
		  {
		  a[j] = -1;
		  }
		}
	  }
	  for (i = 0;i < n;i++)
	  {
		if (a[i] != -1)
		{
		System.out.printf("%d",a[i]);
		}
		break;
	  }
	  i = i + 1;
	  for (;i < n;i++)
	  {
		if (a[i] != -1)
		{
		System.out.printf(",%d",a[i]);
		}
	  }
	  return 0;
	}

}

