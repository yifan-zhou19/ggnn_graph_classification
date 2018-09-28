package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String v = new String(new char[103]);
	 int[] c = new int[106];
	 int[] shang = new int[106];
	 int[] yu = new int[106];
	 int a;
	 int b;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 v = tempVar.charAt(0);
	 }
	 if (v.length() == 1)
	 {
		 System.out.printf("%d",0);
		 System.out.printf("\n%d",v.charAt(0) - 48);
	 }
	 else if (v.length() == 2)
	 {
		 c[0] = v.charAt(0) - 48;
		 c[1] = v.charAt(1) - 48;
		 a = (10 * c[0] + c[1]) / 13;
		 b = (10 * c[0] + c[1]) % 13;
		 System.out.printf("%d",a);
		 System.out.printf("\n%d",b);
	 }
	 else if (v.length() >= 3)
	 {
		 for (int i = 0;i <= v.length() - 1;i++)
		 {
		c[i] = v.charAt(i) - 48;

		 }
	 for (int j = 0;j < v.length() - 1;j++)
	 {
	   shang[j] = (10 * c[j] + c[j + 1]) / 13;
	   yu[j] = (10 * c[j] + c[j + 1]) % 13;
	   c[j + 1] = yu[j];

	 }


	 if (shang[0] == 0)
	 {
		 System.out.printf("%d",shang[1]);
	 }
	  else
	  {
		  System.out.printf("%d",shang[0]);
		  System.out.printf("%d",shang[1]);
	  }
	 for (int k = 2;k < v.length() - 1;k++)
	 {

	   System.out.printf("%d",shang[k]);

	 }
	System.out.printf("\n%d",yu[v.length() - 2]);
	 }
	int y;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		y = Integer.parseInt(tempVar2);
	}
	return 0;
	}

}

