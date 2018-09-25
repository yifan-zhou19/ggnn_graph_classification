package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 char[] s = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		 int[] a = new int[100];
		 int i;
		 int k = 0;
		 int[] b = new int[100];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  s = tempVar.charAt(0);
		  }
		 int len = s.length();
		 for (i = 0;i < len;i++)
		 {
						   a[i] = s[i] - '0';
						   b[i] = (k * 10 + a[i]) / 13;
							k = (k * 10 + a[i]) % 13;
		 }
		 if (len == 1)
		 {
			 System.out.print("0\n");
		 }
		 else
		 {
		 if (b[1] == 0)
		 {
					for (i = 2;i < len - 1;i++)
					{
							 System.out.printf("%d",b[i]);
					}
		 }
		 else
		 {
			 for (i = 1;i < len - 1;i++)
			 {
					  System.out.printf("%d",b[i]);
			 }
		 }
		 System.out.printf("%d\n",b[len - 1]);
		 }
		 System.out.printf("%d\n",k);

	}


}

