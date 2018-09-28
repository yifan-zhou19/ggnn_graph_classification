package <missing>;

public class GlobalMembers
{
	/***************************************************************************
	*autour:??? 
	*number:1000012905
	*description:?????  
	****************************************************************************/
	public static int Main()
	{
		int[] in = new int[1000];
		int[] out = new int[1000];
		char p;
		int count = 0; //????

		//??????????? --!~~~ 
		//????????????????in[]??????????out[]? 
		char pan;
		do
		{
			String q = new String(new char[4]);
			pan = '0';
			int s = 0;
			do
			{
				q = tangible.StringFunctions.changeCharacter(q, s, System.in.read());
				pan = q.charAt(s);
				s++;
			}while ((pan != ',') && (pan != '\n'));
			for (int k = 0; k < s - 1; k++)
			{
				in[count] = in[count] * 10 + (int)(q.charAt(k) - '0');
			}
			count++;
		}while (pan != '\n');
		count = 0;
		do
		{
			String q = new String(new char[4]);
			pan = '0';
			int s = 0;
			do
			{
				q = tangible.StringFunctions.changeCharacter(q, s, System.in.read());
				pan = q.charAt(s);
				s++;
			}while ((pan != ',') && (pan != '\n'));
			for (int k = 0; k < s - 1; k++)
			{
				out[count] = out[count] * 10 + (int)(q.charAt(k) - '0');
			}
			count++;
		}while (pan != '\n');

		//????????? 
		System.out.print(count);
		System.out.print(" ");

		int t = 0; //MAX??????????
		int j = 0;
		int MAX = 0;
		//??????????????  
		for (t = 0; t < 1000; t++)
		{
			int ren = 0; //??????????
			for (j = 0; j < count; j++)
			{
				if ((in[j] <= t) && (t < out[j]))
				{
					ren++;
				}
			}
			if (ren > MAX)
			{
				MAX = ren;
			}
		}

		//?? 
		System.out.print(MAX);
		return 0;
	}

}

