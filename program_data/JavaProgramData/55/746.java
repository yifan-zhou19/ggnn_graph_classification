package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int input; //?????????
	 int output;
	 int n;
	 int[] ex1 = new int[20000];
	 int[] ex2 = new int[20000];
	 int sum = 0;
	 int[] s = new int[20000];
	 int[] f = new int[20000];
	 int[] g = new int[20000];
	 int[] out = new int[20000];
	 String str1 = new String(new char[20000]); //?????????
	 String str2 = new String(new char[20000]);
	 String str3 = new String(new char[20000]);
	 int i; //????????
	 int j;
	 int k;
	 int l = 0;
	 int m;
	 int h;
	 int o;
	 int p;
	 input = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 str1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
	 output = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 n = str1.length(); //??????????
	 for (i = 0;i < n;i++)
	 {
		 ex1[i] = str1.charAt(i);
	 } //????????????
	 for (j = 0;j < n;j++)
	 {
		 if ((ex1[j] >= 48) && (ex1[j] <= 57))
		 {
	 ex2[j] = ex1[j] - 48;
		 }
	 else if ((ex1[j] >= 65) && (ex1[j] <= 90))
	 {
	  ex2[j] = ex1[j] - 55;
	 }
	 else if ((ex1[j] >= 97) && (ex1[j] <= 122))
	 {
	  ex2[j] = ex1[j] - 87;
	 }
	 } //??ascii????0��z?????????
	 for (k = 0;k < n;k++)
	 {
		 sum = sum + ex2[k] * Math.pow((double)input,n - 1.0 - k);
	 } //??????????????
	 s[0] = sum;
	 while (s[l] > 0)
	 {
		 s[l + 1] = s[l] / output;
	 f[l] = s[l] % output;
	 l = l + 1;
	 } //??????????????????????????????
	 for (m = 0;m < l;m++)
	 {
	  g[m] = f[l - m - 1];
	 }
	 for (h = 0;h < m;h++)
	 {
	  if ((g[h] >= 0) && (g[h] <= 9))
	  {
	   out[h] = g[h] + 48;
	  }
	  else if ((g[h] >= 10) && (g[h] <= 35))
	  {
	   out[h] = g[h] + 55;
	  }
	 } //??acsii??????????????????????????
	 for (o = 0;o < m;o++)
	 {
	  str3 = tangible.StringFunctions.changeCharacter(str3, o, out[o]); //??acsii????????????????????????????????
	 }
	 for (p = 0;p < m;p++)
	 {
	  System.out.print(str3.charAt(p));
	 }
	 if (sum == 0)
	 {
	  System.out.print(0);
	 }
	  //????
	 return 0;
	}






}

