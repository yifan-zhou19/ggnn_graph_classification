package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 char[][] danci = new char[50][50];
	 String str = new String(new char[500]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * p;

	 int[] changdu = new int[50];
	 int e;
	 int n = 0;
	 int a;
	 int l;
	 int k;
	 str = new Scanner(System.in).nextLine();

	 p = str;
	 for (a = 0;a < 50;a++)
	 {

	  while (*p == ' ') //????????????
	  {
		  p++;
	  }


	  k = 0;
	  while (*p != ' ' && *p != '\0')
	  {
		danci[a][k] = p;
		k++;
		p++;
	  }
	  danci[a][k] = '\0';

	  changdu[a] = String.valueOf(danci[a]).length();

		if (*p == '\0')
		{
		  break; //???????????????????danci?
		}


	 }


	n = a + 1;

	 for (int k = 1;k <= n;k++)
	 {
	  for (int i = 0;i < n - k;i++)
	  {
	   if (changdu[i] > changdu[i + 1])
	   {
		e = changdu[i + 1];
		changdu[i + 1] = changdu[i];
		changdu[i] = e;
	   }
	  }
	 }

	  for (int t = 0;t < n;t++)
	  {
	  l = String.valueOf(danci[t]).length();
	  if (changdu[n - 1] == l)
	  {
	   System.out.printf("%s\n",danci[t]);
	   break;
	  }
	  }

	 for (int q = 0;q < n;q++)
	 {
	  l = String.valueOf(danci[q]).length();
	  if (changdu[0] == l)
	  {
	   System.out.printf("%s\n",danci[q]);
	   break;
	  }
	 }

	 return 0;
	}
}
