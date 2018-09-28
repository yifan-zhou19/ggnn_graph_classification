package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //,a[20][80]
		int i;
		int j;
		int[] jud = new int[200];
	int[] l = new int[200]; //????????l???????????????????????????19???????????
		char[][] s = new char[200][85];
		String str = new String(new char[5]);
		str = new Scanner(System.in).nextLine();
		n = Integer.parseInt(str);
		for (i = 0;i < n;i++)
		{
		   s[i] = new Scanner(System.in).nextLine();
		}
	/*
	    for(i=0;i<n;i++)
	    {
	       l=strlen(s[i]);
	       for(j=0;j<l;j++)
	       a[i][j]= s[i][j];
	    }
	*///??????????????
		for (i = 0;i < n;i++)
		{
		  l[i] = String.valueOf(s[i]).length();
		  if (s[i][0] != '_')
		  {
			 if (s[i][0] < 'A')
			 {
			 System.out.print("0\n");
			  jud[i] = 1;
			  continue; //??break
			 }
			  if ((s[i][0] < 'a') && (s[i][0]>'Z'))
			  {
			 System.out.print("0\n");
			  jud[i] = 1;
			 continue; //??break
			  }
			 if (s[i][0] > 'z')
			 {
			 System.out.print("0\n");
			  jud[i] = 1;
			  continue; //??break
			 }
		  }
		  for (j = 1;j < l[i];j++)
		  {
			if (s[i][j] != '_')
			{
			 if (s[i][j] < '0')
			 {
			 System.out.print("0\n");
			  jud[i] = 1;
			  break;
			 }
			 if ((s[i][j] > '9') && (s[i][j] < 'A'))
			 {
			 System.out.print("0\n");
			  jud[i] = 1;
			  break;
			 }
			  if ((s[i][j] < 'a') && (s[i][j]>'Z'))
			  {
			 System.out.print("0\n");
			  jud[i] = 1;
			  break;
			  }
			 if (s[i][j] > 'z')
			 {
			 System.out.print("0\n");
			  jud[i] = 1;
			  break;
			 }
			}
		  if (jud[i] == 1)
		  {
		  break;
		  }
		  }
		  if (jud[i] == 0)
		  {
		  System.out.print("1\n");
		  }
		}
	return 0;
	}
}
