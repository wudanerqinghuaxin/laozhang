int a [] = 1,2,3,4,5,6,7;
for(i=o;i<a.length;i++){
	for(j = i;j<a.length;j++){
		if(a[i]<a[j]){
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
}}}
for(i = 0;i<a.length;i++){
	System.out.print(a[i]+"  ");
}
