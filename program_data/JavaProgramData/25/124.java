package <missing>;

public class GlobalMembers
{
	//****************************************************** 
	/* ? ? ?   ???2?n???????
	/* ? ?      ????                           
	/* ? ? ? ??2010 ?  12 ?  15  ?     
	/* ? ? ? ????2?n???n????100?
	/* ? ?      ?1000012752        
	*******************************************************/ 
	public static void chengfang(int[] result, int n)
	{
		int i;
		if (n == 0) //????
		{
			return;
		}
		else
		{
			for (i = 32 ; i >= 0 ; i--)
			{
				result[i] = result[i] * 2; //???2
			}
			for (i = 32 ; i > 0 ; i--) //??
			{
				if (result[i] >= 10)
				{
					result[i - 1] += result[i] / 10;
					result[i] %= 10;
				}
			}
			chengfang(result, n - 1); //???????n=0???????n??
		}
	}
	public static int Main()
	{
		int[] result = new int[33];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(result,0,(Integer.SIZE / Byte.SIZE));
		result[32] = 1; //???????1
		chengfang(result, n);
		p = result; //????????0??
		while (*p == 0)
		{
			p++;
		}
		for (; p <= result + 32 ; p++) //???????
		{
			System.out.print(p);
		}
		return 0;
	}




}

