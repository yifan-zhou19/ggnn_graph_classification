package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static String Main_s = new String(new char[500]);
char[][] o = new char[500][5];
String l1 = new String(new char[7]);
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int[] l = new int[500];
	 int k;
	 int a;
	 int b = 0;
	 int m;
	 int d1 = 0;
	 int d2 = 0;
	 int[] d3 = new int[500];
	 int k8;
	 int k9 = 0;
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	// static char s[500],o[500][5],l1[7];
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 l1 = new Scanner(System.in).nextLine();
	 Main_s = new Scanner(System.in).nextLine();
	 for (i = 0;Main_s.charAt(i + n - 1) != '\0';i++)
	 {
	   for (j = 0;j < n;j++)
	   {
		  o[i][j] = Main_s.charAt(i + j);
	   }
	 }
	   a = i;
	 for (i = 0;i < a;i++)
	 {
	   for (j = 0;j < a;j++)
	   {
		  m = 1;
		  for (k = 0;k < n;k++)
		  {
			if (o[i][k] != o[j][k])
			{
			  m = 0;
			  break;
			}
		  }
		  if (m == 1)
		  {
			b++;
		  }
	   }
	   l[i] = b;
	   b = 0;
	 }
	 for (i = 0;i < a;i++)
	 {
	   if (d1 < l[i])
	   {
		 d1 = l[i];
	   }
	 }
	 if (d1 <= 1)
	 {
	   System.out.print("NO\n");
	 }
	 else
	 {
	   System.out.printf("%d\n",d1);
	   for (i = 0;i < a;i++)
	   {
		  k9 = 0;
		  if (d1 == l[i])
		  {
			for (k8 = 1;k8 <= d2;k8++)
			{
			  if (0 == strcmp(o[i],o[d3[k8]]))
			  {
				 k9 = 1;
				 break;
			  }
			}
			if (k9 == 0)
			{
				for (k = 0;k < n;k++)
				{
			  System.out.printf("%c",o[i][k]);
				}
			System.out.print("\n");
			}
		  }
		  d2++;
		  d3[d2] = i;

	   }
	 }
	}

}

