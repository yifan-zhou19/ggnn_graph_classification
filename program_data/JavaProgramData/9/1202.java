package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int j = 0;
		 int m = 0;

		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }

		 char[][] s1 = new char[100][10];
		 char[][] s2 = new char[100][10];
		 char[][] p1 = new char[100][10];
		 char[][] p2 = new char[100][10];
		 char[][] z1 = new char[100][10];
		 char[][] z2 = new char[100][10];
		 String t = new String(new char[10]);

		 for (i = 0;i < n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 s1[i] = tempVar2.charAt(0);
			 }

			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 s2[i] = tempVar3.charAt(0);
			 }
		 }
		 for (i = 0;i < n;i++)
		 {
		 if (s2[i][1] != '\0' && strcmp(s2[i],"60") >= 0)
		 {
		  p1[j] = s1[i];

		  p2[j] = s2[i];

		  j++;
		 }
		 if (s2[i][2] >= '0' && s2[i][2] <= '9' && s2[i][3] == '\0')
		 {
		 z1[m] = s1[i];

		  z2[m] = s2[i];

		  m++;
		 }
		 }
		 int k = j;
		 for (i = k - 1;i >= 0;i--)
		 {
			 for (j = 0;j < i;j++)
			 {
		 if (strcmp(p2[j],p2[j + 1]) < 0)
		 {

			 t = p2[j];

			 p2[j] = p2[j + 1];

			  p2[j + 1] = t;

			   t = p1[j];

				 p1[j] = p1[j + 1];

				   p1[j + 1] = t;
		 }

			 }
		 }
		  for (i = m - 1;i >= 0;i--)
		  {
			 for (j = 0;j < i;j++)
			 {
		 if (strcmp(z2[j],z2[j + 1]) < 0)
		 {

			 t = z2[j];

			 z2[j] = z2[j + 1];

			  z2[j + 1] = t;

			   t = z1[j];

				 z1[j] = z1[j + 1];

				   z1[j + 1] = t;
		 }

			 }
		  }
		 for (j = 0;j < m;j++)
		 {
		System.out.printf("%s\n",z1[j]);
		 }


	 for (j = 0;j < k;j++)
	 {
		System.out.printf("%s\n",p1[j]);
	 }
	  for (i = 0;i < n;i++)
	  {
	  if (!((s2[i][1] != '\0' && strcmp(s2[i],"60") >= 0) || (s2[i][2] >= '0' && s2[i][2] <= '9' && s2[i][3] == '\0')))
	  {
		  System.out.printf("%s\n",s1[i]);
	  }
	  }


		return 0;
	}


}

