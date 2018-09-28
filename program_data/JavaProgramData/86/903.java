package <missing>;

public class GlobalMembers
{
	/*-----------------------------------------*
	|? ? ?   ?????  		            |
	|? ?      ????	                    |
	|? ? ? ??2010 ? 11 ? 25 ?		    |
	|? ?      ?1000012758		            |
	\*-----------------------------------------*/ 
	public static int Main()
	{
		int NumberOfChildren;
		int Time;
		int[] Jump = new int[20];
		int NumberOfJump;
		int SumOfTime;
		int i;
		int j;
		//???????
		NumberOfChildren = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < NumberOfChildren; i++)
		{
			//???????
			Time = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(Jump, 0, (Integer.SIZE / Byte.SIZE));
			//?????????????
			for (j = 1; j <= Time; j++)
			{
				Jump[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			//?????????
			for (j--; ; j--)
			{
				//?????
				SumOfTime = 3 * j + Jump[j];
				//??60?
				if (SumOfTime <= 60)
				{
					System.out.print((Jump[j] + 60 - SumOfTime));
					System.out.print("\n");
					break;
				}
				//?????????57-60?
				else if (SumOfTime <= 63)
				{
					System.out.print(Jump[j]);
					System.out.print("\n");
					break;
				}
			}
		}
		return 0;
	}
}

