package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[41]); //??????
		int sum = 0;
		int n;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = n;
		while (n > 0) //?????????
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				word = tempVar.charAt(0);
			}
			if (n != t)
			{
			if ((sum + word.length()) <= 80)
			{
				System.out.print(" ");
			} //?????80???????
			if ((sum + word.length()) > 80)
			{
				System.out.print("\n",sum = 0);
			} //??80???????
			}
			sum = sum + word.length(); //?????
			System.out.print(word);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(word,0,(Character.SIZE / Byte.SIZE)); //????
			n--; //?????
			sum++; //????1
		}

		return 0; //??
	}
}

