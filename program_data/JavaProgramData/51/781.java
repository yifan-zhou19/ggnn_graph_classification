package <missing>;

public class GlobalMembers
{
	public static int max(int[] a)
	{
		  int i;
		  int j;
		  int t;
		  for (i = 0,t = a[0];i < 498;i++)
		  {
			   if (t < a[i])
			   {
				   t = a[i];
			   }
		  }
		  return (t);
	}
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int p;
		  int[] a = new int[498];
		  int m;
		  for (i = 0;i < 498;i++)
		  {
			  a[i] = 1;
		  }
		  String str1 = new String(new char[500]);
		  final String str2 = "\0\0\0\0";
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  str1 = tempVar2.charAt(0);
		  }
		  for (j = 0;j < str1.length() - n + 1;j++)
		  {
			   for (p = 0,i = j;p < n;p++,i++)
			   {
				   str2 = tangible.StringFunctions.changeCharacter(str2, p, str1.charAt(i));
			   }
			   for (i = j + 1;i < str1.length();i++)
			   {
					if (str1.charAt(i) == str2.charAt(0))
					{
						   int k = 1;
						   for (m = i + 1, p = 1;m < str1.length() && p < str2.length();m++, p++)
						   {
								 if (str1.charAt(m) == str2.charAt(p))
								 {
									 k++;
								 }
								 else
								 {
									 break;
								 }
						   }
						   if (k == str2.length())
						   {
							   a[j]++;
						   }
					}
			   }

		  }
		  if (max(a) == 1)
		  {
			  System.out.print("NO");
		  }
		  else
		  {
			   System.out.printf("%d\n",max(a));
		  for (i = 0;i < str1.length() - n + 1;i++)
		  {
			   if (a[i] == max(a))
			   {
					 for (p = 0,j = i;p < n;p++,j++)
					 {
						 str2 = tangible.StringFunctions.changeCharacter(str2, p, str1.charAt(j));
					 }
					 System.out.printf("%s\n",str2);
			   }
		  }
		  }

	}

}

