package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int j = 0;
		int[] a = new int[1000];
		int c;
		String zfc = new String(new char[21]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	  while (j < n)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zfc = tempVar2.charAt(0);
		}
		for (i = 0,c = 0;zfc.charAt(i) != '\0';i++)
		{
		  if ((zfc.charAt(i) >= 'a' && zfc.charAt(i) <= 'z') || (zfc.charAt(i) >= 'A' && zfc.charAt(i) <= 'Z') || zfc.charAt(i) == '_' || (zfc.charAt(i) >= '0' && zfc.charAt(i) <= '9'))
		  {
		   c++;
		  }

		}
		if (c == i)
		{
			a[j] = 1;
		}
		else
		{
			a[j] = 0;
		}
		if (a[j] == 1)
		{
		  if (zfc.charAt(0) >= '0' && zfc.charAt(0) <= '9')
		  {
			  a[j] = 0;
		  }
		}
	   j++;
	  }
	  for (j = 0;j < n;j++)
	  {
	  if (a[j] == 0)
	  {
	  System.out.print("no\n");
	  }
	  if (a[j] == 1)
	  {
	  System.out.print("yes\n");
	  }
	  }


	return 0;
	}
}

