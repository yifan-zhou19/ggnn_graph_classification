package <missing>;

public class GlobalMembers
{
	public static int power(int x,int y)
	{
		int i;
		int z = 1;
		for (i = 1;i <= y;i++)
		{
			z = z * x;
		}
		return z;
	}

	public static int Main()
	{
		  int a = 0;
		  int b = 0;
		  int i = 0;
		  int j = 0;
		  int count = 0;
		  int k = 0;
		  int l = 0;
		  String p = new String(new char[64]);
		  String s = new String(new char[64]);
		  int[] q = new int[64];
		  int[] r = new int[64];
		  int n = 0;

		  for (i = 0;i < 64;i++)
		  {
			  p = p.substring(0, i);
			  q[i] = 0;
			  r[i] = 0;
			  s = s.substring(0, i);
		  }

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  p = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b = Integer.parseInt(tempVar3);
		  }

		  for (j = 0;j < 64;j++)
		  {
			  if (p.charAt(j) >= 48 && p.charAt(j) <= 57)
			  {
				  q[j] = p.charAt(j) - 48;
			  }
			  if (p.charAt(j) >= 65 && p.charAt(j) <= 90)
			  {
				  q[j] = p.charAt(j) - 55;
			  }
			  if (p.charAt(j) >= 97 && p.charAt(j) <= 122)
			  {
				  q[j] = p.charAt(j) - 87;
			  }
		  }

		  for (j = 0;j < 64;j++)
		  {
			  if (q[j] != 0)
			  {
				  count = j;
			  }
		  }

		  for (i = count;i >= 0;i--)
		  {
			  n = n + q[count - i] * power(a, i);
		  } //??????n

		  do
		  {
					 r[k] = n % b;
					 n = n / b;
					 k++;
		  } while (n > 0); //???b??

		  for (l = k - 1;l >= 0;l--)
		  {
			  if (r[l] >= 0 && r[l] <= 9)
			  {
				  s = tangible.StringFunctions.changeCharacter(s, l, r[l] + 48);
			  }
			  if (r[l] >= 10 && r[l] <= 35)
			  {
				  s = tangible.StringFunctions.changeCharacter(s, l, r[l] + 55);
			  }
			  System.out.printf("%c",s.charAt(l));
		  }

	}
}

