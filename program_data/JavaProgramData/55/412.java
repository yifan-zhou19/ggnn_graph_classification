package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String ch1 = new String(new char[1000]);
	  String ch2 = new String(new char[1000]);
	  int a;
	  int b;
	  int n = 0;
	  int i;
	  int j;
	  int p = 1;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  ch1 = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b = Integer.parseInt(tempVar3);
	  }
	  for (i = ch1.length() - 1;i >= 0;i--)
	  {
		if (ch1.charAt(i) >= '0' && ch1.charAt(i) <= '9')
		{
			n += (ch1.charAt(i) - '0') * p;
		}
		if (ch1.charAt(i) >= 'A' && ch1.charAt(i) <= 'Z')
		{
			n += (ch1.charAt(i) - 'A' + 10) * p;
		}
		if (ch1.charAt(i) >= 'a' && ch1.charAt(i) <= 'z')
		{
			n += (ch1.charAt(i) - 'a' + 10) * p;
		}
		p *= a;
	  }
	  if (n != 0)
	  {
	  for (i = 0;n >= 1;i++)
	  {
		if (n % b < 10)
		{
			ch2 = tangible.StringFunctions.changeCharacter(ch2, i, n % b + '0');
		}
		else
		{
			ch2 = tangible.StringFunctions.changeCharacter(ch2, i, n % b + 'A' - 10);
		}
		n = (n - n % b) / b;
	  }
	  }
	  else
	  {
		  ch2 = tangible.StringFunctions.changeCharacter(ch2, 0, '0');
		  i = 1;
	  }
	  for (j = i - 1;j >= 0;j--)
	  {
	  System.out.printf("%c",ch2.charAt(j));
	  }
	  System.out.print("\n");
	}
}

