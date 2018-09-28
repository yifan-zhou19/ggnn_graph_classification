package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] words = new char[300][30];
		char temp;
	   int i = 0;
	   int l;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   words[i] = tempVar.charAt(0);
	   }
	   l = String.valueOf(words[i]).length();
	   System.out.printf("%d",l);
	   i++;
	   String tempVar2 = ConsoleInput.scanfRead(null, 1);
	   if (tempVar2 != null)
	   {
		   temp = tempVar2.charAt(0);
	   }
	   while (temp != '\n')
	   {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   words[i] = tempVar3.charAt(0);
		   }
		   l = String.valueOf(words[i]).length();
		   System.out.printf(",%d",l);
		   i++;
				String tempVar4 = ConsoleInput.scanfRead(null, 1);
				if (tempVar4 != null)
				{
					temp = tempVar4.charAt(0);
				}

	   }
	   return 0;
	}

}

