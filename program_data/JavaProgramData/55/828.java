package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int a;
		  int b;
		  int i;
		  int j;
		  int h;
		  int s;
		  int g;
		  int p;
		  int q;
		  int l;
		  String n = new String(new char[100]);
		  int[] m = new int[100];
		  String z = new String(new char[100]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  n = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b = Integer.parseInt(tempVar3);
		  }
		  l = n.length();
		  h = 0;
	  for (i = 1,g = 1,s = 0;i <= l;i++)
	  {
		  if (n.charAt(l - i) >= 'a' && n.charAt(l - i) <= 'z')
		  {
		 h = n.charAt(l - i) - 'a' + 10;
		  }
		 else
		 {
			 if (n.charAt(l - i) >= 'A' && n.charAt(l - i) <= 'Z')
			 {
		 h = n.charAt(l - i) - 'A' + 10;
			 }
		 else
		 {
		 h = n.charAt(l - i) - '0';
		 }
		 }
		 s = s + h * g;
		 g = g * a;
	  }
	if (s == 0)
	{
		System.out.print("0");
	}
	else
	{
	  for (j = 0;s > 0;j++)
	  {
		  m[j] = s % b;
		 s = s / b;
		 q = j;
	  }
	  for (p = 0;p <= q;p++)
	  {
		  if (m[p] >= 0 && m[p] <= 9)
		  {
		  z = tangible.StringFunctions.changeCharacter(z, q - p, m[p] + '0');
		  }
		  else
		  {
		   z = tangible.StringFunctions.changeCharacter(z, q - p, m[p] + 'A' - 10);
		  }
	  }
		z = tangible.StringFunctions.changeCharacter(z, q + 1, '\0');
		 System.out.printf("%s",z);
	}

	}

}

