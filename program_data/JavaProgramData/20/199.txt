package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char max = char a[10];
		final String a = "";
		char[][] b = new char[100][3];
		int i;
		int j;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				b[i] = tempVar2.charAt(0);
			}
			if (a.charAt(i)[0] == '\0')
			{
				break;
			}
		}
		int count = i + 1;
		for (i = 0;i < count;i++)
		{
		 int m = String.valueOf(a.charAt(i)).length();
		 char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		 int k = 0;
		 for (j = 0;j < m;j++)
		 {
			if (k == 0)
			{
				c[j] = a.charAt(i)[j];
			}
			else if (k > 0)
			{
				c[j + 3] = a.charAt(i)[j];
			}
			if ((a.charAt(i)[j] == max(a.charAt(i))) && (k == 0))
			{
				c[j] = a.charAt(i)[j];
				c[j + 1] = b[i][0];
				c[j + 2] = b[i][1];
				c[j + 3] = b[i][2];
				k++;
			}
		 }
		 if (i < count - 1)
		 {
			 System.out.printf("%s\n",c);
		 }
		 else if (i == count - 1)
		 {
			 System.out.printf("%s\n",c);
		 }
		}
	}
	public static char max(String a)
	{
	  int i;
	  char t = a[0];
	  for (i = 0;i < 10;i++)
	  {
		if (a[i].compareTo(t) > 0)
		{
			t = a[i];
		}
	  }
	  return (t);
	}
}

