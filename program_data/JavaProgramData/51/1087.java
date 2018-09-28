package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int l;
		  int i;
		  int k;
		  int j;
		  int n;
		  int t = 1;
		  String str = new String(new char[500]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  str = tempVar2.charAt(0);
		  }
		  l = str.length();
		  char[][] s = new char[500][5];
		  int[] a = new int[500];
		  for (i = 0;i < l - n + 1;i++)
		  {
			  a[i] = 1;
			  for (j = 0;j < n;j++)
			  {
			  s[i][j] = str.charAt(i + j);
			  }
			  s[i][j] = '\0';
		  }
		  for (i = 0;i < l - n;i++)
		  {
			 for (j = i + 1;j < l - n + 1;j++)
			 {
				 if (strcmp(s[i],s[j]) == 0)
				 {
				 a[i]++;
				 }
				 //printf("%d %d\n",a[i],i);
			 }
		  }

			 for (i = 0;i < l - n;i++)
			 {
				 if (t < a[i])
				 {
					 t = a[i];
				 }
			 }
			 if (t == 1)
			 {
				 System.out.print("NO");
			 }
			 else
			 {
				 System.out.printf("%d\n",t);
				 for (i = 0;i < l - n;i++)
				 {
					 if (t == a[i])
					 {
					 System.out.printf("%s\n",s[i]);
					 }
				 }
			 }



	}

}

