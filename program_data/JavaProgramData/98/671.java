package <missing>;

public class GlobalMembers
{
	//**************************************
	//*???????                     
	//*????? 1100012780     	        
	//*???2011.12.30                     
	//**************************************
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		int i;
		char[][] words = new char[1000][40];
		for (i = 0;i < n;i++) //????????
		{
			words[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		int[] len = new int[1000];
		for (i = 0;i < n;i++) //????????
		{
			len[i] = String.valueOf(words[i]).length();
		}
		int[] line = new int[100]; //???????????
		int j = 0;
		System.out.print(words[0]);
		line[0] = len[0];
		for (i = 1;i < n;i++)
		{
			if (line[j] + len[i] + 1 <= 80) //???????
			{
				System.out.print(" ");
				System.out.print(words[i]);
				line[j] += len[i] + 1; //???????
			}
			else //?????
			{
				System.out.print("\n");
				System.out.print(words[i]);
				j++;
				line[j] += len[i];
			}
		}
		return 0;
	}

}

