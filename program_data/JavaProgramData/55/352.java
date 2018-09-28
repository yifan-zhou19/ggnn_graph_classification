package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int l;
		int i;
		int t = 0;
	 String n = new String(new char[100]);
	 String m = new String(new char[100]);
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
	 for (i = 0;i < l;i++)
	 {
		 t *= a;
	  if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
	  {
	  t += n.charAt(i) - '0';
	  }
	  else if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
	  {
	  t += n.charAt(i) - 'a' + 10;
	  }
	  else
	  {
	  t += n.charAt(i) - 'A' + 10;
	  }
	 }
	 if (t != 0)
	 {
		 for (i = 0;t != 0;i++)
		 {
		 if (t % b >= 0 && t % b <= 9)
		 {
	  m = tangible.StringFunctions.changeCharacter(m, i, t % b + '0');
		 }
	  else
	  {
	  m = tangible.StringFunctions.changeCharacter(m, i, t % b - 10 + 'A');
	  }
	  t = (t - t % b) / b;
		 }
	 for (t = i - 1;t >= 0;t--)
	 {
		 System.out.printf("%c",m.charAt(t));
	 }
	 System.out.print("\n");
	 }
	 else
	 {
	 System.out.print("0\n");
	 }
	}
}

