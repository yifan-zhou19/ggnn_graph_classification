package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String str = new String(new char[303]); //??????
	   int[] bigNum = new int[26]; //???????????0?bigNum[0]??�A�?bigNum[1]??'B'???
	   int[] smallNum = new int[26]; //???????????0?smallNum[0]??�a�?smalNum[1]??'b'???
	   int i; //tag?????????????????????????????tag???0
	   int n;
	   int tag = 1;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   str = tempVar.charAt(0);
	   }
	   for (i = 0;str.charAt(i) != '\0';i++) //??????????
	   {
		   if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
		   {
			   smallNum[str.charAt(i) - 'a']++;
		   }

		   if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
		   {
			   bigNum[str.charAt(i) - 'A']++;
		   }
	   }

	   for (i = 0;i < 26;i++)
	   {
		   if (bigNum[i] > 0)
		   {
			   System.out.printf("%c=%d\n",'A' + i,bigNum[i]);
			   tag = 0;
		   }
	   }
	   for (i = 0;i < 26;i++)
	   {
		   if (smallNum[i] > 0)
		   {
			   System.out.printf("%c=%d\n",'a' + i,smallNum[i]);
			   tag = 0;
		   }
	   }
	   if (tag == 1)
	   {
		   System.out.print("No");
	   }

		 return 0;
	}

}

