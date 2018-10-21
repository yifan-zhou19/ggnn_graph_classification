package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s1 = new String(new char[100]);
	  char s;
	  int[] a = new int[310];
	  int i = 0;
	  int j = 0;
	  int t = 0;
	  int k;
	  int r;
	  while (true)
	  {
		  s = System.in.read();
		  if (s == '\n')
		  {
			  r = 1;
			  for (k = j - 1;k >= 0;k--)
			  {
				  t = t + (s1.charAt(k) - '0') * r;
				  r = r * 10;
			  }
			  a[i] = t;
			  t = 0;
			  j = 0;
			  i++;
			  break;
		  }
		  else if (s >= '0' && s <= '9')
		  {
			  s1 = tangible.StringFunctions.changeCharacter(s1, j, s);
			  j++;
		  }
		  else
		  {
			  r = 1;
			  for (k = j - 1;k >= 0;k--)
			  {
				  t += (s1.charAt(k) - '0') * r;
				  r *= 10;
			  }
			  a[i] = t;
			  t = 0;
			  j = 0;
			  i++;
		  }
	  }
	  int n = i;
	  int max = -1;
	  for (i = 0;i < n;i++)
	  {
	  if (a[i] > max)
	  {
		  max = a[i];
	  }
	  }
	  for (i = 0;i < n;i++)
	  {
	  if (a[i] == max)
	  {
		  a[i] = -2;
	  }
	  }
	  max = -1;
	  for (i = 0;i < n;i++)
	  {
	  if (a[i] > max)
	  {
		  max = a[i];
	  }
	  }
	  if (max > -1)
	  {
	  System.out.printf("%d\n",max);
	  }
	  else
	  {
		  System.out.print("No\n");
	  }
	  System.in.read();
	  System.in.read();
	}

}

