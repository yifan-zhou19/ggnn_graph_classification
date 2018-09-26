package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int k;
	  int m;
	  int t;
	  int l;
	  int q;
	  int p;

	  String a = new String(new char[100001]);
	  String c = new String(new char[27]);
	  char[] zm = {'0', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = tempVar2.charAt(0);
		  }
		  int[] b = new int[27];
		  t = 0;
		  l = 0;
		  p = 0;
		  for (k = 0;a.charAt(k);k++)
		  {
			  for (m = 1;m <= 26;m++)
			  {
				  if (a.charAt(k) == zm[m])
				  {
					  b[m]++;
				  }
			  }
		  }
		  for (m = 1;m <= 26;m++)
		  {
			  if (b[m] != 1)
			  {
				  t++;
			  }
			  else
			  {
				  c = tangible.StringFunctions.changeCharacter(c, l, zm[m]);
				  l++;
			  }
		  }
		  if (t == 26)
		  {
			  System.out.print("no\n");
		  }
		  else
		  {
			  for (k = 0;a.charAt(k);k++)
			  {
				  for (q = 0;q < l;q++)
				  {
					  if (a.charAt(k) == c.charAt(q))
					  {
						  System.out.printf("%c\n",a.charAt(k));
						  p++;
						  break;
					  }
				  }
				  if (p == 1)
				  {
					  break;
				  }
			  }
		  }

	  }

	return 0;
	}





}

