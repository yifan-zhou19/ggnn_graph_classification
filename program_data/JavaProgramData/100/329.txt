package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[300]);
		String word = new String(new char[300]);
		char p;
	  int i;
	  int k = 0;
	  int len;
	  int[] num = new int[300];
	  int j;
	  int t;
	  int check = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   str = tempVar.charAt(0);
	   }

	   len = str.length();

	   for (i = 0;i < len;i++)
	   {
		   if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
		   {
				word = tangible.StringFunctions.changeCharacter(word, k, str.charAt(i));
				check = 1;
			for (j = i + 1;j < len;j++)
			{
			if (str.charAt(i) == str.charAt(j))
			{
			str = str.substring(0, j);
			num[k] = num[k] + 1;
			}
			}
			k++;
		   }
	   }

	   for (i = 0;i < k - 1;i++)
	   {
		   for (j = i + 1;j < k;j++)
		   {
			if (word.charAt(i) > word.charAt(j))
			{
					p = word.charAt(i);
					word = tangible.StringFunctions.changeCharacter(word, i, word.charAt(j));
					word = tangible.StringFunctions.changeCharacter(word, j, p);
			  t = num[i];
			  num[i] = num[j];
			  num[j] = t;
			}
		   }
	   }
	   for (i = 0;i < k;i++)
	   {
		   System.out.printf("%c=%d\n",word.charAt(i),(num[i] + 1));
	   }
	   if (check == 0)
	   {
		   System.out.print("No");
	   }
	   return 0;

	}
}

