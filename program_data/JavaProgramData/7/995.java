package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[1000]);
		  String b = new String(new char[1000]);
		  String c = new String(new char[1000]);
		  int[] d = new int[1000];
		  int i;
		  int j = 0;
		  int k;
		  int m;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = tempVar.charAt(0);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  b = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  c = tempVar3.charAt(0);
		  }
		  for (i = 0;;i++)
		  {
					   if (a.charAt(i) == '\0')
					   {
						   break;
					   }
					   else
					   {
						   if (a.charAt(i) == b.charAt(0))
						   {
										 j++;
										 d[j] = i;
						   }
					   }
		  }
		  if (j == 0)
		  {
			  System.out.printf("%s",a);
		  }
		  else
		  {
			m = j;
		  for (i = 0;;i++)
		  {
					   if (b.charAt(i) == '\0')
					   {
						   break;
					   }
		  }
		  n = i;
		  for (j = 0;j < m;j++)
		  {
						  k = d[j];
						  for (i = 0;i < n;i++)
						  {
										  if (b.charAt(i) != a.charAt(i + k))
										  {
											  break;
										  }
						  }
						  if (i == n)
						  {
							  break;
						  }
		  }
		  for (i = 0;i < n;i++)
		  {
						  a = tangible.StringFunctions.changeCharacter(a, i + d[j], c.charAt(i));
		  }
		  System.out.printf("%s",a);
		  }
	}








}

