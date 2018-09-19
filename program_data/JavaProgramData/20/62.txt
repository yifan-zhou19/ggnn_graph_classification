package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j;
		int k;
		int[] c = new int[10];
		final String a = "";
		final String b = "";
		char m;
	for (i = 0;;i++)
	{

		if (EOF == scanf("%s %s",a.charAt(i),b.charAt(i)))
		{
			break;
		}
	}


		for (j = 0;j < i;j++)
		{
			for (k = 0,m = a.charAt(j)[0];k < String.valueOf(a.charAt(j)).length() - 1;k++)
			{
				if (m < a.charAt(j)[k + 1])
				{
					c[j] = k + 1;
				m = a.charAt(j)[k + 1];
				}
			}
		}
		 for (j = 0;j < i;j++)
		 {
			 for (k = String.valueOf(a.charAt(j)).length() - 1;k > c[j];k--)
			 {
			 a.charAt(j)[k + 3] = a.charAt(j)[k];
			 }
			 a.charAt(j)[c[j] + 1] = b.charAt(j)[0];
			  a.charAt(j)[c[j] + 2] = b.charAt(j)[1];
			   a.charAt(j)[c[j] + 3] = b.charAt(j)[2];

		 }
		 for (j = 0;j < i;j++)
		 {
			 System.out.printf("%s\n",a.charAt(j));
		 }
	}





}
