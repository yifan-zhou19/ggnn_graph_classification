package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String ori = new String(new char[500]);
	 char[][] a = new char[500][6];
	 int[] num = new int[500];
	 int i;
	 int n;
	 int j;
	 int count = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 ori = tempVar2.charAt(0);
	 }
	 int l = ori.length();
	 for (i = 0; i < l - n + 1; i++)
	 {
	  String tmp = new String(new char[6]);
	  for (j = 0; j < n; j++)
	  {
	   tmp = tangible.StringFunctions.changeCharacter(tmp, j, ori.charAt(i + j));
	  }
	  tmp = tangible.StringFunctions.changeCharacter(tmp, j, '\0');
	  int found = 0;
	  for (j = 0; j < count; j++)
	  {
	   if (strcmp(a[j], tmp) == 0)
	   {
		found = 1;
		num[j]++;
		break;
	   }
	  }
	  if (found == 0)
	  {
	   for (j = 0; j <= n; j++)
	   {
		a[count][j] = tmp.charAt(j);
	   }
	   num[count]++;
	   count++;
	  }
	 }
	 int max = 0;
	 for (i = 0; i < count; i++)
	 {
	  if (num[i] > max)
	  {
		  max = num[i];
	  }
	 }
	 if (max == 1)
	 {
	  System.out.print("NO");
	  return 0;
	 }
	 System.out.printf("%d\n", max);
	 for (i = 0; i < count; i++)
	 {
	  if (num[i] == max)
	  {
	   System.out.printf("%s\n", a[i]);
	  }
	 }

	 return 0;
	}
}

