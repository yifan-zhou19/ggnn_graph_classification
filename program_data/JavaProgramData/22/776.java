package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
	  String b = new String(new char[300]);
	  int max1;
	  int max2;
	  int i;
	  int m = 0;
	  int n;
	  for (i = 0;i < 300;i++)
	  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[i] = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(null, 1);
		  if (tempVar2 != null)
		  {
			  b = tangible.StringFunctions.changeCharacter(b, i, tempVar2);
		  }
		  if (b.charAt(i) != ',')
		  {
			  break;
		  }

	  }
	  n = i;
	  for (i = 0;i < n - 1;i++)
	  {
		  if (a[i] != a[i + 1])
		  {
			  m = m + 1;
		  }
	  }
	  if (m == 0)
	  {
		  System.out.print("No");
	  }
	  else
	  {

	 if (n == 0)
	 {
		 System.out.print("No");
	 }
	 else
	 {
		 max1 = a[0];
	 max2 = 0;
	 for (i = 0;i < 300;i++)
	 {
		 if (a[i] > max1)
		 {
			 max2 = max1;
			 max1 = a[i];

		 }

		 else if (a[i] > max2 && a[i] < max1)
		 {
			 max2 = a[i];
		 }
	 }

	if (max1 == max2)
	{
	System.out.print("No");
	}
	else
	{
	System.out.printf("%d",max2);
	}
	 }
	  }
	return 0;
	}
}

