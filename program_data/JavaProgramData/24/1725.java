package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String zf = new String(new char[200]);
	char[][] sl = new char[200][200];
	String z = new String(new char[200]);
	String a = new String(new char[100]);
	String max = new String(new char[100]);
	String min = new String(new char[100]);
	int i;
	int l;
	int k = 0;
	int t = 0;
	int m;
	int n = 0;
	int len;
	int ci = 0;
	zf = new Scanner(System.in).nextLine();
	l = zf.length();
	for (i = 0;i < l;i++)
	{
	   if (zf.charAt(i) == ' ')
	   {

		   n = 0;
		   for (m = t;m < i;m++)
		   {
			   sl[k][n] = zf.charAt(m);
			   n++;
		   }
		   sl[k][n] = '\0';
		   t = i + 1;
		   k++;

	   }
	}
	n = 0;
	 for (m = t;m < l;m++)
	 {
			   sl[k][n] = zf.charAt(m);
			   n++;
	 }
		   sl[k][n] = '\0';
	len = k + 1;


	max = sl[0];
	min = sl[0];


		for (k = 0;k < len;k++)
		{
			if (String.valueOf(sl[k]).length() > max.length())
			{
			   max = sl[k];
			}
			if (String.valueOf(sl[k]).length() < min.length())
			{
			   min = sl[k];
			}
		}
	System.out.printf("%s\n",max);
	System.out.printf("%s\n",min);





	return 0;
	}

}
