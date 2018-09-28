package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String v = new String(new char[10000]);
	  v = new Scanner(System.in).nextLine();
	  int[] a = new int[400];
	  for (int i = 0;i <= v.length() - 1;i++)
	  {
		if ((v.charAt(i) == ' ') && (v.charAt(i + 1) == ' '))
		{
			   for (int j = i;j <= v.length() - 1;j++)
			   {
				   v = tangible.StringFunctions.changeCharacter(v, j, v.charAt(j + 1));
			   }
				i--;
		}
	  }

	 int p = 0;
	 for (int i = 0;i <= v.length() - 1;i++)
	 {
		if (v.charAt(i) == ' ')
		{
		   a[p] = i;
		   p++;
		}
	 }
	if (p == 0)
	{
		System.out.printf("%d",v.length());
	}
	else
	{
		System.out.printf("%d,",a[0]);
	 for (int i = 0;i <= p - 2;i++)
	 {
	   System.out.printf("%d,",a[i + 1] - a[i] - 1);
	 }
	 System.out.printf("%d",v.length() - 1 - a[p - 1]);
	}
	 int y;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 y = Integer.parseInt(tempVar);
	 }
	 return 0;



	}

}

