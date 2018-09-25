package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[] num = new int[128];
	  int i;
	  int j = 0;
	  String zf = new String(new char[300]);
	  char c;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  zf = tempVar.charAt(0);
	  }
	  i = 0;
	 for (i = 0;zf.charAt(i) != 0;i++)
	 {
		n = zf.charAt(i);
		if (((65 <= n) && (n <= 90)) || ((97 <= n) && (n <= 122)))
		{
		   num[n]++;
		   j++;
		}
	 }
	  if (j == 0)
	  {
	  System.out.print("No");
	  }
	  else
	  {
		 for (i = 65;i < 123;i++)
		 {
			 if (num[i] != 0)
			 {
				c = i;
				System.out.printf("%c=%d\n",c,num[i]);
			 }
		 }
	  }

	  return 0;
	}

}

