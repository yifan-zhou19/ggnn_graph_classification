package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[5000]);
		String b = new String(new char[5000]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int num = 1;
		int lengtha;
		int lengthb;
		int[] ren = new int[1001];
		int[] a0 = new int[1000];
		int[] b0 = new int[1000];
		int j = 0;
		int k = 0;
		lengtha = a.length();
		lengthb = b.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ren,0,(Integer.SIZE / Byte.SIZE)); //???0
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a0,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b0,0,(Integer.SIZE / Byte.SIZE));
		for (int i = 0;i < lengtha;i++) //?????????????
		{
		  if (a.charAt(i) != ',')
		  {
		  a0[j] = 10 * a0[j] + (a.charAt(i) - '0'); //??????
		  }
		  if (a.charAt(i) == ',')
		  {
			num = num + 1; //?????
			j = j + 1; //???????????
		  }
		}
		for (int i = 0;i < lengthb;i++)
		{
		  if (b.charAt(i) != ',')
		  {
		  b0[k] = 10 * b0[k] + (b.charAt(i) - '0'); //??????
		  }
		  if (b.charAt(i) == ',')
		  {
		  k = k + 1; //???????????
		  }
		}
		for (int i = 0;i < 1000;i++)
		{
		  for (j = 0;j < num;j++)
		  {
			if ((a0[j] <= i) && (b0[j]> i)) //??????????
			{
			ren[i] = ren[i] + 1;
			}
		  }
		}
		sort(ren,ren + 1000); //?????????
		System.out.print(num);
		System.out.print(" ");
		System.out.print(ren[999]);
		return 0;
	}

}

