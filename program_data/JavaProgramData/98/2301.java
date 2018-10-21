package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int k;
	  int end = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String dz = new String(new char[50]);
	  for (i = 0;i < n;i++)
	  {
		 for (i = 0; i < n; i++)
		 {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			dz = tempVar2.charAt(0);
		}
		k = dz.length();

		if (end + k + 1 > 80)
		{
			System.out.print("\n");
			end = 0;
		}
		else if (end > 0)
		{
			System.out.print(" ");
			end++;
		}
		System.out.printf("%s", dz);
		end += k;
		 }
	  }
	return 0;
	}

}

