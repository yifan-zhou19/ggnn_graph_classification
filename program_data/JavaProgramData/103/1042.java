package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[100]);
	int[] b = new int[100];
	int i;
	int k;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
		  for (i = 0;a.charAt(i) != '\0';i++)
		  {
							if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
							{
							a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
							}
		  }
		 i = 0;
		 while (a.charAt(i) != '\0')
		 {
		 for (k = i;;k++)
		 {
			 if (a.charAt(k) != a.charAt(i))
			 {
			 break;
			 }
		 }
		 System.out.printf("(%c,%d)",a.charAt(i),k - i);
		 i = k;
		 }
	}
}

